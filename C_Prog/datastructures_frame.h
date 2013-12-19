#ifndef __DatastructuresFrame__
#define __DatastructuresFrame__

#include "wx/frame.h"

class DatastructuresFrame : public wxFrame {

private:
	void Initialize();
	void CreateMenuBar();
	
public:
	DatastructuresFrame(wxWindow* parent,
            wxWindowID id,
            const wxString& title,
            const wxPoint& pos = wxDefaultPosition,
            const wxSize& size = wxDefaultSize,
            long style = wxDEFAULT_FRAME_STYLE | wxSUNKEN_BORDER);

	~DatastructuresFrame();
	DECLARE_EVENT_TABLE()
	
	void OnClose(wxCloseEvent &e);
	void OnQuit(wxCommandEvent &e);
	
};
#endif // __DatastructuresFrame__
