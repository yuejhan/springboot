package com.imooc.reposity;

import com.imooc.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * 继承自jpaRepository<实体类,ID类型></实体类,>
 * @author cody
 * @version V1.0
 * @create 2017/10/22 15:48
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
