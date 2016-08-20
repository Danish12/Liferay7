package com.liferayrevisited;

import com.liferay.portal.kernel.service.UserLocalServiceWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.BaseModelSearchResult;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {}, service = ServiceWrapper.class)
public class MyUserLocalServiceOverride extends UserLocalServiceWrapper {

	public MyUserLocalServiceOverride() {
		super(null);
	}

	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap, Map<String, Object> resultsMap)
			throws PortalException {

		System.out.println("****************MyUserLocalServiceOverride.authenticateByEmailAddress()"
				+ "ATHENTICATION DONE USING MyUserLocalServiceOverride ***************");

		return super.authenticateByEmailAddress(companyId, emailAddress, password, headerMap, parameterMap, resultsMap);
	}

	@Override
	public User getUserByEmailAddress(long companyId, String emailAddress) throws PortalException {
		System.out.println("MyUserLocalServiceOverride.getUserByEmailAddress()");
		return super.getUserByEmailAddress(companyId, emailAddress);
	}

	@Override
	public User createUser(long userId) {
		System.out.println("MyUserLocalServiceOverride.createUser()");
		return super.createUser(userId);
	}

	@Override
	public List<User> getUsers(int start, int end) {
		System.out.println("MyUserLocalServiceOverride.getUsers()");
		return super.getUsers(start, end);
	}

	@Override
	public List<User> search(long companyId, String firstName, String middleName, String lastName, String screenName,
			String emailAddress, int status, LinkedHashMap<String, Object> params, boolean andSearch, int start,
			int end, OrderByComparator<User> obc) {
		System.out.println("MyUserLocalServiceOverride.search()");
		return super.search(companyId, firstName, middleName, lastName, screenName, emailAddress, status, params,
				andSearch, start, end, obc);
	}

	@Override
	public Hits search(long companyId, String firstName, String middleName, String lastName, String screenName,
			String emailAddress, int status, LinkedHashMap<String, Object> params, boolean andSearch, int start,
			int end, Sort sort) {
		System.out.println("MyUserLocalServiceOverride.search()");
		return super.search(companyId, firstName, middleName, lastName, screenName, emailAddress, status, params,
				andSearch, start, end, sort);
	}

	@Override
	public Hits search(long companyId, String firstName, String middleName, String lastName, String screenName,
			String emailAddress, int status, LinkedHashMap<String, Object> params, boolean andSearch, int start,
			int end, Sort[] sorts) {
		System.out.println("MyUserLocalServiceOverride.search()");
		return super.search(companyId, firstName, middleName, lastName, screenName, emailAddress, status, params,
				andSearch, start, end, sorts);
	}

	@Override
	public List<User> search(long companyId, String keywords, int status, LinkedHashMap<String, Object> params,
			int start, int end, OrderByComparator<User> obc) {
		System.out.println("MyUserLocalServiceOverride.search()");
		return super.search(companyId, keywords, status, params, start, end, obc);
	}

	@Override
	public Hits search(long companyId, String keywords, int status, LinkedHashMap<String, Object> params, int start,
			int end, Sort sort) {
		System.out.println("MyUserLocalServiceOverride.search()");
		return super.search(companyId, keywords, status, params, start, end, sort);
	}

	@Override
	public Hits search(long companyId, String keywords, int status, LinkedHashMap<String, Object> params, int start,
			int end, Sort[] sorts) {
		System.out.println("MyUserLocalServiceOverride.search()");
		return super.search(companyId, keywords, status, params, start, end, sorts);
	}

	@Override
	public BaseModelSearchResult<User> searchUsers(long companyId, String keywords, int status,
			LinkedHashMap<String, Object> params, int start, int end, Sort sort) throws PortalException {
		System.out.println("MyUserLocalServiceOverride.searchUsers()");
		return super.searchUsers(companyId, keywords, status, params, start, end, sort);
	}

	@Override
	public BaseModelSearchResult<User> searchUsers(long companyId, String keywords, int status,
			LinkedHashMap<String, Object> params, int start, int end, Sort[] sorts) throws PortalException {
		System.out.println("MyUserLocalServiceOverride.searchUsers()");
		return super.searchUsers(companyId, keywords, status, params, start, end, sorts);
	}

}