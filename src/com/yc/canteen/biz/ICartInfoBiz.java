package com.yc.canteen.biz;

import java.util.List;
import java.util.Map;

import com.yc.canteen.entity.CartInfo;

public interface ICartInfoBiz {

	//查询购物车编号和商品编号
	public List<Map<String, Object>> findCart(String mno);
	
	//根据会员编号，查询详细信息
	public List<CartInfo> finds(String mno);
	
	//修改数量
	public int updateNum(String cno, int num);
	
	//添加购物车
	public int add(CartInfo cf);
	
	//删除购物车
	public int delete(String cnos);
	
}
