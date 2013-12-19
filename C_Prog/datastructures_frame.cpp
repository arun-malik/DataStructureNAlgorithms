#include "datastructures_frame.h"
#include <wx/toolbar.h>
#include <wx/statusbr.h>
#include <wx/sizer.h>
#include <wx/menu.h> //wxMenuBar

BEGIN_EVENT_TABLE(DatastructuresFrame, wxFrame)
	EVT_CLOSE(DatastructuresFrame::OnClose)
	EVT_MENU(wxID_EXIT, DatastructuresFrame::OnQuit)
END_EVENT_TABLE()

DatastructuresFrame::DatastructuresFrame(wxWindow* parent,
                     wxWindowID id,
                     const wxString& title,
                     const wxPoint& pos,
                     const wxSize& size,
                     long style)
		: wxFrame(parent, id, title, pos, size, style)
{
	Initialize();
}

DatastructuresFrame::~DatastructuresFrame()
{

}

void DatastructuresFrame::Initialize()
{
	wxBoxSizer *sz = new wxBoxSizer(wxVERTICAL);
	SetSizer(sz);
	
	//Create a status bar 
	wxStatusBar* statusBar = new wxStatusBar(this, wxID_ANY);
	statusBar->SetFieldsCount(1);
	SetStatusBar(statusBar);
	GetStatusBar()->SetStatusText(_("Ready"));
	
	//Create a menu bar
	CreateMenuBar();
	
	sz->Layout();
}

void DatastructuresFrame::OnClose(wxCloseEvent &e)
{
	e.Skip();
}

void DatastructuresFrame::OnQuit(wxCommandEvent &e)
{
	wxUnusedVar(e);
	Close();
}

void DatastructuresFrame::CreateMenuBar()
{
	wxMenuBar *mb = new wxMenuBar();
	//File Menu
	wxMenu *menu = new wxMenu();
	menu->Append(wxID_EXIT);
	mb->Append(menu, _("&File"));
	SetMenuBar(mb);
}
