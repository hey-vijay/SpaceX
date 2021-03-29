package vijay.app.spacex.Utils.calback;

import vijay.app.spacex.model.CrewMember;

public interface ClickListener {
    void onItemClick(CrewMember member);
    void openWiki(String wikiURL);
}
