package com.neo.address.parse;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * 测试主类
 *
 * @author Neo
 * @since 2022/8/9 14:00
 */
public class AddressParseTest {


    public static void main(String[] args) {
        ArrayList<String> address = Lists.newArrayList(
                "太阳鲜鲜 盐田区山海四季城F栋17A，13111111111",
                "盐田区山海四季城F栋2f，13111111111 太阳鲜鲜",
                "谢先生，深圳市龙岗区南湾街道尚峰花园4C2231 13111111111",
                "测试 江西九江市湖口县武山镇 15912344321",
                "盐田区山海四季城D栋17A\n周敏 13111111111",
                "广东省深圳市盐田区东海三街山海四季城F4E，李侯明，13111111111",
                "深圳市盐田区，大梅沙万科东海岸221栋，周女士13111111111",
                "收货人: 杨燕艳\n手机号码: 13111111111\n所在地区: 广东省深圳市龙岗区龙岗街道\n详细地址: 格水村三巷十号三楼",
                "地址:深圳市盐田区山海四季城A栋32D\n张欢 13111111111",
                "地址：深圳市龙华新区樟坑一区通博花园181栋\n收件人：于生生\n电话：13111111111",
                "所在地区: 湖南省株洲市醴陵市白兔潭镇\n详细地址: 金牛居委会金牛路5号国超\n刘娇 131 1111 1111",
                "江西南昌市青山湖区广兰大道418号东华理工大学核工系南区9栋1112室 131 1111 1111 孙轶念",
                "湖北黄石市牧羊湖水机路华瑞南岸星城一栋一单元2202。\n\n刘月红13111111111",
                "盐田区北山道山海四季城F20D 韩先生 13111111111",
                "深圳市盐田区盐田街道东海三街8号山海四季花园  曾候丽  13111111111",
                "深圳市罗湖区凤凰路中山花园1栋582室，刘蓝琴，电話13111111111",
                "袁月青13111111111四川省成都市高新西区百叶路1号电子科技大学成都学院计算机(分院)",
                "盐田区山海四季城F栋1B，卢燕13111111111",
                "地址：广东省佛山市顺德区乐从天佑城E座2005室；\n联系人：熊翠花\n联系电话：13111111111；",
                "深圳市南山区南光路龙坤居2栋D座714，收件人：张珍云，电话：13111111111",
                "深圳市盐田区万科东海岸21-102，收件人：叶侠，电话：131 1111 1111",
                "地址：深圳市 南山区 南商路碧海天家园A89B 联系电话：13111111111 黄发猜",
                "都匀市水岸绿洲小区2栋二单元2033  李玉 13111111111",
                "贵州省都匀市。甘塘镇绿茵湖村一组2号  刘雪莉     13111111111",
                "湛江市廉江市车板镇人才市场，0755-22107333.曹建林 邮编：713200",
                "广东省清远市 清城区洲心街道，金茂家园一栋一楼100号商铺   13111111111 聂小姐",
                "江苏省 苏州市 吴江区 干将东路678号江苏大厦11楼 215000 徐天宇 13911111111",
                "王小梅13911111111湖南省郴州市桂东县桂东县清泉镇",
                "莫席辉13911111111广西壮族自治区柳州市柳北区跃进路42号4栋20楼",
                "韩仁伟,13911111111,安徽省安庆市太湖县新仓镇，塔山村，前进组",
                "北京市北京市东城区建设路紫薇花园 13311111111 何晓旭",
                "13311111111 上海市黄浦区 建设路 紫薇花园  何晓旭",
                "王晓光 重庆市 垫江县 太平镇，13311111111",
                "瓦丽丽，13311111111，甘肃省 兰州市 城关区 东岗街道向阳街道",
                "刘海江13311111111河南省省直辖县级行政区划济源市沁园路丹尼斯",
                "13311111111 广东省 东莞市 中堂镇潢涌大坦村二街四巷1号",
                "韩丽丽 13311111111 广东省 东莞市 望牛墩镇赤滘村南昌南路53号",
                "蔡丽凤,13311111111,江苏省盐城市其它区神州路御景湾7#1104",
                "张彤，13311111111，黑龙江省 大兴安岭地区 加格达奇区 铁路南小区29号楼4单元5658sf",
                "黄梅, 13311111111, 江西省 抚州市 临川区 上顿渡镇江西省抚州市临川区上顿渡镇老公安局",
                "何花菊，86-13311111111，辽宁省 盘锦市 盘山县 东郭镇 辽宁省盘锦市盘山县东郭镇 ，000000",
                "雁平 86-13311111111 广东省 江门市 恩平市 牛江镇 岭南娟姑水果店",
                "北京 北京市 顺义区 胜利街道宜宾南区2-2-401  李俊南 18210997754"
        );
        Stopwatch stopwatch = Stopwatch.createStarted();
        for (String s : address) {
            System.out.println("===============" + s + "===============");
            AddressParse.parse(s).forEach(i -> System.out.println(i.format()));
        }
        System.out.println("耗时:" + stopwatch.elapsed(TimeUnit.MILLISECONDS));
    }
}