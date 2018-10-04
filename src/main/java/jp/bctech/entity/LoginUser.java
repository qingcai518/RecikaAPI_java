package jp.bctech.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.List;

public class LoginUser extends org.springframework.security.core.userdetails.User {
	private static final long serialVersionUID = 5401955439991159861L;
	private User user;
	
	public User getUser() {
		return user;
	}
	
	public LoginUser(User user) {
		super(user.getName(), user.getPassword(), determineRoles(false));
		this.user = user;
	}
	
	private static final List<GrantedAuthority> USER_ROLES = AuthorityUtils.createAuthorityList("ROLE_USER");
    private static final List<GrantedAuthority> ADMIN_ROLES = AuthorityUtils.createAuthorityList("ROLE_ADMIN", "ROLE_USER");

    private static List<GrantedAuthority> determineRoles(boolean isAdmin) {
        return isAdmin ? ADMIN_ROLES : USER_ROLES;
    }
}
