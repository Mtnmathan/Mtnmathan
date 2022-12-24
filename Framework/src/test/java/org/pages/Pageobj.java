package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.support.PageFactory;

public class Pageobj extends LibGlobal{
	public Pageobj() {
		PageFactory.initElements(driver, this);
	}
}
