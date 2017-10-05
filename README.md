# IPdatabase
一个解析IP的项目
# 采用的是将10进制的ipv 转换成二叉树，用二叉查找树，查找对应的ip地址，时间复杂度为log2n
# 支持批量解析，由于需要打开项目的文件，第一个ip解析会比较慢
# example：输出
IpInfo{country='中国', province='广东省', city='江门市'}

    @Test
    public void example()  {
       System.out.println(IpUtil.analyticIp("202.192.240.126"));
    }
