package CustomLintTool;

import com.android.tools.lint.detector.api.*;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class IssueRegistry extends com.android.tools.lint.client.api.IssueRegistry {

    public IssueRegistry(){

    }

    @Override
    public List<Issue> getIssues() {
        List<Issue> issueList = new ArrayList<>();
        issueList.add(PRIVACY_ISSUE);
        return issueList;
    }

    public static final Issue PRIVACY_ISSUE = Issue.create(
            "PrivacyPolicy",
            "Possible privacy violation",
            //add explanation
            "None, yet",
            Category.CORRECTNESS, 6, Severity.WARNING,
            new Implementation(IssueDetector.class, EnumSet.of(Scope.ALL_JAVA_FILES)));


}
