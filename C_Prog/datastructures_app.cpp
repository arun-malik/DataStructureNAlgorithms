#include "datastructures_app.h"
#include "wx/image.h"
#include "wx/sysopt.h"
#include "wx/xrc/xmlres.h"
#include "datastructures_frame.h"

IMPLEMENT_APP(DatastructuresApp)

DatastructuresApp::DatastructuresApp()
{
}

DatastructuresApp::~DatastructuresApp()
{
}

bool DatastructuresApp::OnInit()
{
	// Init resources and add the PNG handler
	wxSystemOptions::SetOption(_T("msw.remap"), 0);
	wxXmlResource::Get()->InitAllHandlers();
	wxImage::AddHandler( new wxPNGHandler );
	wxImage::AddHandler( new wxCURHandler );
	wxImage::AddHandler( new wxICOHandler );
	wxImage::AddHandler( new wxXPMHandler );
	wxImage::AddHandler( new wxGIFHandler );

	wxFrame* frame = new DatastructuresFrame(NULL,
                                   wxID_ANY,
                                   wxT("DataStructures"),
                                   wxDefaultPosition,
								   wxSize(800, 600));
	


	frame->Show(TRUE);
	SetTopWindow(frame);
	return TRUE;
}

int DatastructuresApp::OnExit()
{
	return 0;
}

