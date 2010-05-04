jsx3.Class.defineClass(
        "tibco.uxcore.gui.WizardPrevButton",
        tibco.uxcore.gui.WizardNavButton,
        null,
        function (button) {

            button.prototype.handleNav = function(objEvent, nextPanel) {
                if(nextPanel) {
                    objEvent.wizButton = this;
                    this.getWizard().jumpToPanel(objEvent, nextPanel);
                }
                else {
                    objEvent.wizButton = this;
                    this.getWizard().prevPanel(objEvent);
                }
            }

        }
);