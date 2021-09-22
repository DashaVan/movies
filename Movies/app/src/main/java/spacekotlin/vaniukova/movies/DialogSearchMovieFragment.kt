package spacekotlin.vaniukova.movies

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import spacekotlin.vaniukova.movies.databinding.DialogSearchMovieFragmentBinding
import spacekotlin.vaniukova.movies.movie_list.QueryMovie

class DialogSearchMovieFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val binding = DialogSearchMovieFragmentBinding.inflate(LayoutInflater.from(context))
        val builder = AlertDialog.Builder(
            requireContext()
        )
        builder
            .setView(binding.root)

        binding.ibCancel.setOnClickListener {
            dismiss()
        }

        binding.buttonSearch.setOnClickListener {
            if (binding.editTextTitle.text.isNotEmpty()) {
                val searchByTitle = binding.editTextTitle.text.toString()
                val searchYear = binding.editTextYear.text.toString()
                val type =
                    if (binding.checkBoxMovies.isChecked && binding.checkBoxSerials.isChecked) {
                        ""
                    } else {
                        if (binding.checkBoxMovies.isChecked) {
                            "movie"
                        } else {
                            if (binding.checkBoxSerials.isChecked) {
                                "series"
                            } else ""
                        }
                    }
                (parentFragment as QueryMovie).query(searchByTitle, searchYear, type)
                dismiss()
            } else {
                Toast.makeText(
                    requireContext(),
                    "поле title обязательно для заполнения",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }
        }
        return builder.create()
    }
}