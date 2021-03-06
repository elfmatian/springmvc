/**       
 * @Title: PostService.java

 * @Package com.ynswet.homecloud.common.service
 * @Description: TODO
 * @author 李玉鹏
 * @date 2015年5月14日 下午4:03:53
 * @version V1.0  
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company:广州合光信息科技有限公司</p>      
 */
package com.ynswet.system.sc.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;


/**
 * 类功能说明
 * <p>Title: PostService.java</p>
 * @author 李玉鹏
 * @date 2015年5月14日 下午4:03:53
 * 类修改者	修改日期
 * 修改说明
 * @version V1.0
 * <p>Description:立翔云</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company:广州合光信息科技有限公司</p>
 */
public interface PostService {
	
	public void deletePost(Integer postId);
	public void deltePost(Integer orgid,Integer roleId,Integer uid);
	public List<Map<String,Object>> findPost(Integer uid);
	public List<Integer> findUids(Collection<Integer> orgids);
}
