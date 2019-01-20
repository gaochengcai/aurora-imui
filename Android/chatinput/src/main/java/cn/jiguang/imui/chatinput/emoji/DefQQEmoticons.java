package cn.jiguang.imui.chatinput.emoji;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import cn.jiguang.imui.chatinput.R;

public class DefQQEmoticons {
    public static final HashMap<String, Integer> sQQEmoticonHashMap = new HashMap<>();

    public static final int[] SYS_EMOCATION_ORDER = { 23, 40, 19, 43, 21, 9, 20, 106, 35, 10, 25, 24, 1, 0, 33, 32, 12, 27, 13, 22, 3, 18, 30, 31, 81, 82,
            26, 2, 37, 50, 42, 83, 34, 11, 49, 84, 39, 78, 5, 4, 6, 85, 86, 87, 46, 88, 44, 89, 48, 14, 90, 41, 36, 91, 51, 17, 60, 61, 92, 93, 66, 58, 7, 8,
            57, 29, 28, 74, 59, 80, 16, 70, 77, 62, 15, 68, 75, 76, 45, 52, 53, 54, 55, 56, 63, 73, 72, 65, 94, 64, 38, 47, 95, 71, 96, 97, 98, 99, 100, 79,
            101, 102, 103, 104, 105, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131,
            132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142 };

    public static final int[] STATIC_SYS_EMOTCATION_RESOURCE = {
            R.drawable.f_static_000, R.drawable.f_static_001, R.drawable.f_static_002,
            R.drawable.f_static_003, R.drawable.f_static_004, R.drawable.f_static_005, R.drawable.f_static_006, R.drawable.f007, R.drawable.f008,
            R.drawable.f_static_009, R.drawable.f_static_010, R.drawable.f_static_011, R.drawable.f_static_012, R.drawable.f_static_013,
            R.drawable.f_static_014, R.drawable.f_static_015, R.drawable.f016, R.drawable.f_static_017, R.drawable.f_static_018, R.drawable.f_static_019,
            R.drawable.f_static_020, R.drawable.f_static_021, R.drawable.f_static_022, R.drawable.f_static_023, R.drawable.f_static_024,
            R.drawable.f_static_025, R.drawable.f_static_026, R.drawable.f_static_027, R.drawable.f028, R.drawable.f_static_029, R.drawable.f_static_030,
            R.drawable.f_static_031, R.drawable.f032, R.drawable.f_static_033, R.drawable.f_static_034, R.drawable.f_static_035, R.drawable.f_static_036,
            R.drawable.f_static_037, R.drawable.f_static_038, R.drawable.f039, R.drawable.f_static_040, R.drawable.f_static_041, R.drawable.f_static_042,
            R.drawable.f_static_043, R.drawable.f_static_044, R.drawable.f_static_045, R.drawable.f_static_046, R.drawable.f047, R.drawable.f_static_048,
            R.drawable.f_static_049, R.drawable.f_static_050, R.drawable.f_static_051, R.drawable.f_static_052, R.drawable.f_static_053,
            R.drawable.f_static_054, R.drawable.f_static_055, R.drawable.f_static_056, R.drawable.f057, R.drawable.f058, R.drawable.f_static_059,
            R.drawable.f060, R.drawable.f_static_061, R.drawable.f_static_062, R.drawable.f_static_063, R.drawable.f064, R.drawable.f_static_065,
            R.drawable.f_static_066, R.drawable.f067, R.drawable.f068, R.drawable.f069, R.drawable.f_static_070, R.drawable.f071, R.drawable.f_static_072,
            R.drawable.f_static_073, R.drawable.f_static_074, R.drawable.f075, R.drawable.f076, R.drawable.f_static_077, R.drawable.f078,
            R.drawable.f_static_079, R.drawable.f080, R.drawable.f_static_081, R.drawable.f_static_082, R.drawable.f_static_083, R.drawable.f_static_084,
            R.drawable.f_static_085, R.drawable.f_static_086, R.drawable.f_static_087, R.drawable.f_static_088, R.drawable.f_static_089,
            R.drawable.f_static_090, R.drawable.f_static_091, R.drawable.f_static_092, R.drawable.f_static_093, R.drawable.f_static_094,
            R.drawable.f_static_095, R.drawable.f_static_096, R.drawable.f_static_097, R.drawable.f_static_098, R.drawable.f_static_099,
            R.drawable.f_static_100, R.drawable.f_static_101, R.drawable.f_static_102, R.drawable.f_static_103, R.drawable.f_static_104,
            R.drawable.f_static_105, R.drawable.f_static_106, R.drawable.f107, R.drawable.f108, R.drawable.f109, R.drawable.f110, R.drawable.f111,
            R.drawable.f112, R.drawable.f113, R.drawable.f114, R.drawable.f115, R.drawable.f116, R.drawable.f117, R.drawable.f118, R.drawable.f119,
            R.drawable.f120, R.drawable.f121, R.drawable.f122, R.drawable.f123, R.drawable.f124, R.drawable.f125, R.drawable.f126, R.drawable.f127,
            R.drawable.f128, R.drawable.f129, R.drawable.f130, R.drawable.f131, R.drawable.f132, R.drawable.f133, R.drawable.f134, R.drawable.f135,
            R.drawable.f136, R.drawable.f137, R.drawable.f138, R.drawable.f139, R.drawable.f140, R.drawable.f141, R.drawable.f142
    };

    public static final String[] SYS_EMOTICON_SYMBOL =
            {
                    "[呲牙]", "[调皮]", "[流汗]", "[偷笑]", "[再见]", "[敲打]", "[擦汗]", "[猪头]", "[玫瑰]", "[流泪]", "[大哭]", "[嘘]", "[酷]", "[抓狂]", "[委屈]",
                    "[便便]", "[炸弹]", "[菜刀]", "[可爱]", "[色]", "[害羞]", "[得意]", "[吐]", "[微笑]", "[发怒]", "[尴尬]", "[惊恐]", "[冷汗]", "[爱心]", "[示爱]", "[白眼]", "[傲慢]", "[难过]", "[惊讶]", "[疑问]", "[睡]",
                    "[亲亲]", "[憨笑]", "[爱情]", "[衰]", "[撇嘴]", "[阴险]", "[奋斗]", "[发呆]", "[右哼哼]", "[拥抱]", "[坏笑]", "[飞吻]", "[鄙视]", "[晕]", "[装逼]", "[可怜]", "[赞]", "[踩]", "[握手]", "[胜利]", "[抱拳]",
                    "[凋谢]", "[饭]", "[蛋糕]", "[西瓜]", "[啤酒]", "[瓢虫]", "[勾引]", "[OK]", "[爱你]", "[咖啡]", "[钱]", "[月亮]", "[美女]", "[刀]", "[发抖]", "[差劲]", "[拳头]", "[心碎]", "[太阳]", "[礼物]", "[足球]",
                    "[骷髅]", "[挥手]", "[闪电]", "[饥饿]", "[困]", "[咒骂]", "[折磨]", "[抠鼻]", "[鼓掌]", "[糗大了]", "[左哼哼]", "[哈欠]", "[快哭了]", "[吓]", "[篮球]", "[乒乓]", "[NO]", "[跳跳]", "[怄火]", "[转圈]", "[磕头]",
                    "[回头]", "[跳绳]", "[激动]", "[街舞]", "[献吻]", "[左太极]", "[右太极]", "[闭嘴]",
                    "[招财进宝]", "[双喜]", "[鞭炮]", "[灯笼]", "[发财]", "[K歌]", "[购物]", "[邮件]", "[帅]", "[喝彩]", "[祈祷]", "[爆筋]", "[棒棒糖]", "[喝奶]", "[下面]", "[香蕉]", "[飞机]", "[开车]", "[高铁左车头]", "[车厢]",
                    "[高铁右车头]", "[多云]", "[下雨]", "[钞票]", "[熊猫]", "[灯泡]", "[风车]", "[闹钟]", "[打伞]", "[彩球]", "[钻戒]", "[沙发]", "[纸巾]", "[药]", "[手枪]", "[青蛙]"
            };

    static {
        for (int i = 0; i < SYS_EMOTICON_SYMBOL.length; i++) {
            sQQEmoticonHashMap.put(SYS_EMOTICON_SYMBOL[i], STATIC_SYS_EMOTCATION_RESOURCE[i]);
        }
    }
}
