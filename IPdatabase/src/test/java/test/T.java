package test;

import com.wyu.etl.util.IpUtil;
import com.wyu.etl.util.ip.IpInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 * @author:Ken
 */
public class T {

    @Test
    public void example()  {
        List<String> ips = new ArrayList<>();
        //第一次运行，线程要打开文件，会比较慢
        for (int i = 0; i < 10000; i++) {
            ips.add("117.64.94.253");
            ips.add("202.192.240.126");
            ips.add("202.192.240.29");
            ips.add("123.11.24.126");
            ips.add("117.23.94.222");
            ips.add("158.012.121.253");
        }
        List<IpInfo> infos = IpUtil.analyticIp(ips);
        for (IpInfo info : infos) {
            System.out.println(info);
        }
        IpUtil.analyticIp("223.84.159.244");
    }

    @Test
    public void testGetIpInfos() throws Exception {
        List<IpInfo> infos = IpUtil.getIpInfos();
        for (IpInfo info: infos) {
            System.out.println(info);
        }
    }
}
