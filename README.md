#超市会员管理系统  
#07-18

com.cy.aspect  切面类  
com.cy.config  配置类  
com.cy.controller  控制层  
com.cy.dao  dao层  
com.cy.entity  实体类  
com.cy.exception  异常处理类  
com.cy.service  service层  
com.cy.serviceImpl  service实现类  
com.cy.vo  vo类  

※账号:admin 密码:123  

---------------------------------  
会员信息表:member ※增加salt字段  
会员类别表:member_grade  
礼品表:gift  
礼品兑换记录表:exchange_record  
商品表:commodity  
商品购买记录表:transaction_record  
管理员账户表:admin   ※增加salt字段  
---------------------------------  

需求文档  

●会员模块  
1.添加会员信息  
 a.接收页面输入数据,保存会员信息  
 b.保存会员头像图片到项目资源路径下,保存图片的url到数据库  
 c.使用salt,md5等加密明文密码,保存会员的密文密码  
 
2.查询会员信息  
 a.分页显示必要的会员信息  
3.修改会员状态(正常,挂失,冻结)  
 a.根据下拉菜单选择,修改会员状态信息 
4.删除会员信息  
 a.根据会员id删除会员信息  
 
5.会员类别增改查  
 a.显示所有会员类别信息  
 b.保存新的会员类别  
 c.修改现有会员类别折扣  
 
6.兑换礼品  
 a.在下拉菜单显示所有礼品名  
 b.根据输入的会员id,查询会员积分信息
  -如果积分足够兑换礼品,则可以兑换礼品并扣除积分  
 c.将礼品兑换记录保存到礼品兑换记录表  
 
7.充值会员余额  
 a.接收输入的充值金额,更新会员的余额信息  
 
●礼品消费  
1.添加礼品  
 a.保存礼品信息  
 b.数据验证  
 
2.修改礼品数量  
 a.根据输入修改礼品的数量  
 
3.删除礼品  
 a.删除选中的礼品信息  
 
4.查询会员兑换礼品的记录  
 a.分页显示兑换礼品的记录  
 b.搜索指定会员的兑换记录,可以模糊查询  

●商品功能 
1.添加商品
 a.根据输入的商品信息添加商品信息到商品信息表  
 
2.商品修改  
 a.分页显示商品信息  
 b.点击修改按钮进入修改界面  
  -修改界面：需要有选中商品的信息回显  
  -保存修改后的商品信息  
  
3.商品购买  
 a.手动输入商品名和会员id  
 b.如果选择余额支付,则扣除会员的积分  
 c.点击购买商品  
  -提交时需要验证商品号码和会员号码,通过会员账号和商品名称来验证或者加一个商品查询
  
4.积分记录  
 a.分页显示积分记录  
 b.模糊查询会员账号  

●生日提醒  
 1.如果当天有会员过生日,则可以编辑并通过邮箱发送信息给会员  

●积分抽奖  
 输入积分,点击随机分配按钮，随机将积分加给一个会员  

●登陆系统  

1.修改管理员  
 a.显示当前登陆的账号信息  
 b.只能修改自己的管理员信息  
 
2.添加管理员  
 a.根据输入的管理员信息,增加管理员账号  
 b.管理员密码需要密文保存  
 c.点击重置数据按钮,可以清空输入的信息  
 
3.删除管理员  
 a.分页显示管理员信息  
 b.删除选择的管理员账号,不能删除自己  
 
 4.页面拦截  
  a.如果没有登录,自动跳转到登录界面  
  b.如果输入正确的管理员账号,跳转到欢迎界面  
