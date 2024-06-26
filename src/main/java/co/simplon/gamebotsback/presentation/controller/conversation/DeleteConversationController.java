package co.simplon.gamebotsback.presentation.controller.conversation;

import co.simplon.gamebotsback.business.service.conversation.Iconversationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for deleting conversations in the presentation layer.
 * This controller handles HTTP DELETE requests
 * to delete conversations by their IDs.
 */
@RestController
public class DeleteConversationController {

  /**
   * The service responsible for managing conversations.
   */
  private final Iconversationservice conversationService;

  /**
   * Constructs a new DeleteConversationController with the
   * specified conversation service.
   *
   * @param serviceConversation
   *     The conversation service to be used for deleting
   *     conversations.
   */
  @Autowired
  public DeleteConversationController(
      final Iconversationservice serviceConversation) {
    this.conversationService = serviceConversation;
  }

  /**
   * Handles HTTP DELETE requests to delete a conversation by its ID.
   *
   * @param conversationId
   *     The ID of the conversation to be deleted.
   */
  @DeleteMapping("/conversations/{conversationId}")
  public void deleteConversationByConversationId(
      @PathVariable final int conversationId) {
    conversationService.deleteConversation(conversationId);
  }

}
