package com.ynswet.system.sc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ynswet.system.sc.domain.RoleMenu;
import com.ynswet.system.sc.domain.RoleMenuId;

/**
 * 
 * 类功能说明
 * <p>Title: RoleMenuRepository.java</p>
 * @author 原勇
 * @date 2015年5月9日 下午3:00:54
 * 类修改者	修改日期
 * 修改说明
 * @version V1.0
 * <p>Description:立翔云</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company:广州合光信息科技有限公司</p>
 */

public interface RoleMenuRepository extends JpaRepository<RoleMenu, RoleMenuId> {
	
	@Query(value="select r.id.menuId from RoleMenu r where r.id.roleId = ?1")
	public List<Integer> findMenuIdByRoleId(Integer roleId); 
	
	@Query(value="select r from RoleMenu r where r.id.roleId = ?1")
	public List<RoleMenu> findByRoleId(Integer roleId);
}
