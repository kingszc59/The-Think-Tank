import UIKit

//MARK: - Constants

let numberOfSections = 5

let topMargin = 10
let sideMargin = 20
let bottomMargin = 30
let spacingBetweenSections = 5

//MARK: - Enums

enum CellType {
    case Message
    case Date
    case Image
}

//MARK: - Variables

var tableViewDataSource: [CellType] = [.Message, .Date, .Image]

//MARK: - Classes

class TextFieldCell: UITableViewCell {
    
    //MARK: - Properties
    
    var messageTextField: UITextField!
    
    //MARK: - Initializers
    
    override init(style: UITableViewCellStyle, reuseIdentifier: String?) {
        super.init(style: style, reuseIdentifier: reuseIdentifier)
        setupMessageTextField()
    }
    
    required init?(coder aDecoder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    
    //MARK: - Private Methods
    
    private func setupMessageTextField() {
        messageTextField = UITextField(frame: .zero)
        messageTextField.placeholder = "Enter message here"
        messageTextField.translatesAutoresizingMaskIntoConstraints = false
        addSubview(messageTextField)
        
        let topConstraint = messageTextField.topAnchor.constraint(equalTo: topAnchor, constant: topMargin)
        let bottomConstraint = messageTextField.bottomAnchor.constraint(equalTo: bottomAnchor, constant: -bottomMargin)
        let leadingConstraint  = messageTextField.leadingAnchor.constraint(equalTo: leadingAnchor, constant: sideMargin)
        let trailingConstraint = messageTextField.trailingAnchor.constraint(equalTo: trailingAnchor, constant: -sideMargin)
        
        NSLayoutConstraint.activate([topConstraint, bottomConstraint, leadingConstraint, trailingConstraint])
    }
}

class DateTimePickerCell: UITableViewCell {
    
    //MARK: - Properties
    
    var dateTimePicker: UIDatePicker!
    
    //MARK: - Initializers
    
    override init(style: UITableViewCellStyle, reuseIdentifier: String?) {
        super.init(style: style, reuseIdentifier: reuseIdentifier)
        setupDateTimePicker()
    }
    
    required init?(coder aDecoder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    
    //MARK: - Private Methods
    
    private func setupDateTimePicker() {
        dateTimePicker = UIDatePicker(frame: .zero)
        dateTimePicker.datePickerMode = .date
        dateTimePicker.translatesAutoresizingMaskIntoConstraints = false
        addSubview(dateTimePicker)
        
        let topConstraint = dateTimePicker.topAnchor.constraint(equalTo: topAnchor, constant: topMargin)
        let bottomConstraint = dateTimePicker.bottomAnchor.constraint(equalTo: bottomAnchor, constant: -bottomMargin)
        let leadingConstraint  = dateTimePicker.leadingAnchor.constraint(equalTo: leadingAnchor, constant: sideMargin)
        let trailingConstraint = dateTimePicker.trailingAnchor.constraint(equalTo: trailingAnchor, constant: -sideMargin)
        
        NSLayoutConstraint.activate([topConstraint, bottomConstraint, leadingConstraint, trailingConstraint])
    }
}

class ImagePickerCell: UITableViewCell {
    
    //MARK: - Properties
    
    var imagePickerButton: UIButton!
    
    //MARK: - Initializers
    
    override init(style: UITableViewCellStyle, reuseIdentifier: String?) {
        super.init(style: style, reuseIdentifier: reuseIdentifier)
        setupImagePickerButton()
    }
    
    required init?(coder aDecoder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    
    //MARK: - Private Methods
    
    private func setupImagePickerButton() {
        imagePickerButton = UIButton(type: .custom)
        imagePickerButton.translatesAutoresizingMaskIntoConstraints = false
        imagePickerButton.setTitle("Pick Image", for: .normal)
        addSubview(imagePickerButton)
        
        let topConstraint = imagePickerButton.topAnchor.constraint(equalTo: topAnchor, constant: topMargin)
        let bottomConstraint = imagePickerButton.bottomAnchor.constraint(equalTo: bottomAnchor, constant: -bottomMargin)
        let leadingConstraint  = imagePickerButton.leadingAnchor.constraint(equalTo: leadingAnchor, constant: sideMargin)
        let trailingConstraint = imagePickerButton.trailingAnchor.constraint(equalTo: trailingAnchor, constant: -sideMargin)
        
        NSLayoutConstraint.activate([topConstraint, bottomConstraint, leadingConstraint, trailingConstraint])
    }
}

//MARK: - UITableViewDataSource

extension TheThinkTank: UITableViewDataSource {
    
    func numberOfSections(in tableView: UITableView) -> Int {
        return numberOfSections
    }
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return tableViewDataSource.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cellType = tableViewDataSource[indexPath.row]
        switch cellType {
        case .Message:
            let messageCell = tableView.dequeueReusableCell(withIdentifier: "TextFieldCell") as! TextFieldCell
            return messageCell
        case .Date:
            let dateTimeCell = tableView.dequeueReusableCell(withIdentifier: "DateTimePickerCell") as! DateTimePickerCell
            return dateTimeCell
        case .Image:
            let imagePickerCell = tableView.dequeueReusableCell(withIdentifier: "ImagePickerCell") as! ImagePickerCell
            return imagePickerCell
        }
    }
    
    func tableView(_ tableView: UITableView, heightForRowAt indexPath: IndexPath) -> CGFloat {
        return UITableViewAutomaticDimension
    }
    
    func tableView(_ tableView: UITableView, estimatedHeightForRowAt indexPath: IndexPath) -> CGFloat {
        return UITableViewAutomaticDimension
    }
    
    func tableView(_ tableView: UITableView, viewForHeaderInSection section: Int) -> UIView? {
        let headerView = UIView(frame: CGRect(x: 0, y: 0, width: tableView.frame.width, height: spacingBetweenSections))
        headerView.backgroundColor = .clear
        return headerView
    }
    
    func tableView(_ tableView: UITableView, heightForHeaderInSection section: Int) -> CGFloat {
        return spacingBetweenSections
    }
    
    func tableView(_ tableView: UITableView, viewForFooterInSection section: Int) -> UIView? {
        let footerView = UIView(frame: CGRect(x: 0, y: 0, width: tableView.frame.width, height: spacingBetweenSections))
        footerView.backgroundColor = .clear
        return footerView
    }
    
    func tableView(_ tableView: UITableView, heightForFooterInSection section: Int) -> CGFloat {
        return spacingBetweenSections
    }
}