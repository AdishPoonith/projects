.class public final synthetic Landroidx/activity/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lda/a;


# direct methods
.method public synthetic constructor <init>(Lda/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/k;->a:Lda/a;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/k;->a:Lda/a;

    invoke-static {v0}, Landroidx/activity/OnBackPressedDispatcher$c;->a(Lda/a;)V

    return-void
.end method
