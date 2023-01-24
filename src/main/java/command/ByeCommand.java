package command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import exceptions.DukeException;

/***
 * This class has to do with exiting the program
 */

public class ByeCommand extends Command {

    /**
     * constructor for command.ByeCommand
     */
    public ByeCommand() {
        super();
    }

    /***
     * Exits the program
     * @param taskList
     * @param ui
     * @param storage
     * @throws DukeException
     * // reused from github: https://github.com/nus-cs2103-AY2223S1/forum/issues/287
     */
    public String execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        setExitTrue();
        return ui.exit();
    }
}
