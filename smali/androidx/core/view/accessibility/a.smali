.class public final Landroidx/core/view/accessibility/a;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field private final j:I

.field private final k:Landroidx/core/view/accessibility/b;

.field private final l:I


# direct methods
.method public constructor <init>(ILandroidx/core/view/accessibility/b;I)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput p1, p0, Landroidx/core/view/accessibility/a;->j:I

    iput-object p2, p0, Landroidx/core/view/accessibility/a;->k:Landroidx/core/view/accessibility/b;

    iput p3, p0, Landroidx/core/view/accessibility/a;->l:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iget v0, p0, Landroidx/core/view/accessibility/a;->j:I

    const-string v1, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Landroidx/core/view/accessibility/a;->k:Landroidx/core/view/accessibility/b;

    iget v1, p0, Landroidx/core/view/accessibility/a;->l:I

    invoke-virtual {v0, v1, p1}, Landroidx/core/view/accessibility/b;->F(ILandroid/os/Bundle;)Z

    return-void
.end method
