/*******************************************************************************************************
 * Continued by PikaMug (formerly HappyPikachu) with permission from _Blackvein_. All rights reserved.
 * 
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN
 * NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************************************/

package me.blackvein.quests;

public class Options {
	private boolean allowCommands = true;
	private boolean useDungeonsXLPlugin = false;
	private boolean usePartiesPlugin = true;
	
	public boolean getAllowCommands() {
		return allowCommands;
	}
	
	public void setAllowCommands(boolean allowCommands) {
		this.allowCommands = allowCommands;
	}
	
	public boolean getUseDungeonsXLPlugin() {
		return useDungeonsXLPlugin;
	}
	
	public void setUseDungeonsXLPlugin(boolean useDungeonsXLPlugin) {
		this.useDungeonsXLPlugin = useDungeonsXLPlugin;
	}
	
	public boolean getUsePartiesPlugin() {
		return usePartiesPlugin;
	}
	
	public void setUsePartiesPlugin(boolean usePartiesPlugin) {
		this.usePartiesPlugin = usePartiesPlugin;
	}
}