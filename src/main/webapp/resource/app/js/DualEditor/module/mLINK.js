DualEditor.markup.LINK = function(contents){
	contents = contents.replace(/[!]\[(.*)\]\((.*)\)/igm, "<p><img src=\"$2\" style=\"max-width:100%; height: auto;\" alt=\"$1\"></p>");
	contents = contents.replace(/\[(.*)\]\((.*)\)/igm, "<a href=\"$2\" target=\"_blank\">$1</a>");
	return contents;
};