package al.tonikolaba;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import al.tonikolaba.main.BatBatSpringTests;

@RunWith(JUnitPlatform.class)
@SelectPackages({ "al.tonikolaba.main", "al.tonikolaba.gamestate", "al.tonikolaba.gamestate.entity" })
@SelectClasses({ BatBatSpringTests.class })
@ExcludeClassNamePatterns({ "^.*ATests?$" })
public class ProjectSuiteTests {

}
