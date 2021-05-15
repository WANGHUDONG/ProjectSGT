package com.rain.dao;

import static com.rain.util.common.Constants.EMPLOYEETABLE;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.rain.dao.provider.EmployeeDynaSqlProvider;
import com.rain.domain.Employee;
import com.rain.domain.Page;

public interface EmployeeDao {
	/**
	 * 
	 * @return
	 */
	//查询
	
			@Select("select count(*) from "+EMPLOYEETABLE+" ")
			Integer getCount();
			
			@Select("select count(*) from "+EMPLOYEETABLE+" where name like CONCAT('%',#{content},'%')")
			Integer getLikeCount(String content);
			
			
	
			@Select("select * from "+EMPLOYEETABLE+" left join family_inf on (employee_inf.famSta = family_inf.fam_id)  order by dept_id ASC, reg_num ASC, job_id ASC limit #{startPos},#{pageSize}")
			List<Employee> get_List(Page page);
			@Select("select * from "+EMPLOYEETABLE+" left join family_inf on (employee_inf.famSta = family_inf.fam_id)  where name like CONCAT('%',#{content},'%')  order by dept_id ASC, reg_num ASC, job_id ASC, family_inf.family_status ASC limit #{startPos},#{pageSize}")
			List<Employee> get_LikeList(Page page);
			
			
			@SelectProvider(type=EmployeeDynaSqlProvider.class,method="insert_Employee")
			void insert_Info(Employee employee);
			
			@Select("select * from "+EMPLOYEETABLE+" where id = #{id}")
			Employee get_Info(Integer id);

			@SelectProvider(type=EmployeeDynaSqlProvider.class,method="update_Employee")
			void update_Info(Employee employee);
			// 根据id删除部门
			@Delete(" delete from "+EMPLOYEETABLE+" where id = #{id} ")
			void delete_Info(Integer id);
			
			@Select("select * from "+EMPLOYEETABLE+" where name=#{name} and password=#{password}")
			Employee get_ByInfo(@Param("name") String name, @Param("password") String password);
}
