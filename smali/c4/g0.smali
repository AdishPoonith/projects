.class final Lc4/g0;
.super Lc4/i0;
.source "SourceFile"


# instance fields
.field final synthetic j:Landroid/content/Intent;

.field final synthetic k:Landroid/app/Activity;

.field final synthetic l:I


# direct methods
.method constructor <init>(Landroid/content/Intent;Landroid/app/Activity;I)V
    .locals 0

    iput-object p1, p0, Lc4/g0;->j:Landroid/content/Intent;

    iput-object p2, p0, Lc4/g0;->k:Landroid/app/Activity;

    iput p3, p0, Lc4/g0;->l:I

    invoke-direct {p0}, Lc4/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lc4/g0;->j:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc4/g0;->k:Landroid/app/Activity;

    iget v2, p0, Lc4/g0;->l:I

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
