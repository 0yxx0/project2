package com.yc.canteen.biz;

import java.util.List;
import java.util.Map;

import com.yc.canteen.entity.OrderInfo;

public interface IOrderInfoBiz {

	List<Map<String, String>> finds(String mno);

	int add(String cnos, double price,String mno);

	public Map<String, Object> week();


}