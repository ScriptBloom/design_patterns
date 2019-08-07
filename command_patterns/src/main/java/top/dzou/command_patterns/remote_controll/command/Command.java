package top.dzou.command_patterns.remote_controll.command;

/**
 * @author dingxiang
 * @date 19-8-7 上午10:35
 */

/**
 * 命令接口
 */
public interface Command {
    /**
     * 撤销方法接口
     */
    void undo();

    /**
     * 执行命令方法接口
     */
    void execute();
}
