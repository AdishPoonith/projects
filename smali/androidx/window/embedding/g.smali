.class public final synthetic Landroidx/window/embedding/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;

.field public final synthetic k:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/window/embedding/g;->j:Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;

    iput-object p2, p0, Landroidx/window/embedding/g;->k:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/window/embedding/g;->j:Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;

    iget-object v1, p0, Landroidx/window/embedding/g;->k:Ljava/util/List;

    invoke-static {v0, v1}, Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;->a(Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;Ljava/util/List;)V

    return-void
.end method
