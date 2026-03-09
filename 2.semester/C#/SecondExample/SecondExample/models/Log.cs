namespace Examples.models;

public class Log
{
    private List<string> _messages;
    private string _title;

    public Log(string title, string description = "")
    {
        _title = title;

        Description = string.Empty;

        _messages = new();
    }
    
    public string Description { get; set; }

    public string Title
    {
        get { return _title; }
        
        set { if (value.Length < 10)
                _title = value; }
    }

    public string this[int index]
    {
        get
        {
            if (0 <= index && index < _messages.Count)
                return _messages[index];
            else 
                return string.Empty;
        }

        set
        {
            try
            { 
                _messages[index] = value;
            }
            
            catch (IndexOutOfRangeException e)
            {
                // no assignment
            }
            
        }
    }

    public void m(ref int x)
    {
        if (x > 10)
        {
            x = 10;
        }
    }
}