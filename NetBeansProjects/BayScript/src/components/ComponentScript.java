    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import ScriptingEngine.Script;
import java.awt.Graphics;

/**
 *
 * @author Bayjose
 */
public class ComponentScript extends Component{
    
    private Script script;
    
    public ComponentScript(String[] data) {
        super(EnumComponentType.Script, data);
        this.script = new Script(data[0]);
    }

    @Override
    public void tick(){
        this.script.tick();
    }
    
    @Override
    public void render(Graphics g){
        this.script.render(g);
    }
    
    @Override
    String[] save() {
        return this.LoadedData;
    }
}
