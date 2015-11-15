package yelp;

/**
 * Created by ann on 11/6/15.
 * Yelp onsite 题目
 * http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=139291&highlight=yelp%2B%C3%E6%BE%AD
 *
 *
 * 前面聊了大概20多分钟吧，
 * 接下来是coding题，设计扫雷游戏的板子，
 * 输入有三个参数，板子的长m，宽n，雷的个数k，
 * 把雷随机的放进去，并计算出其他格子的number，返回一个二维数组，
 * 一开始我就在纠结怎么样不重复的埋雷，面试官说可以先不考虑这个，
 * 然后就开始写代码了，
 * 写到计算其他格子number的时候面试官说这里可以先跳过去，
 * 认为你会写了，写好以后，
 * 面试官说咱们回过头来解决埋雷不重复的问题，纠结了一下，终于解决了。然后问了他两个问题就结束了
 *
 * hint : 把所有的位置建一个数组，用一个index指向倒数第二个位置，每次从该index（包含这个index）
 * 以前的数里面随机取一个，随机取出来的数为雷的位置，在把该数和index后面的数交换，index前移，
 * 一直这样循环到得到需要的雷的个数为止。
 */


public class MineSweeper {
}
