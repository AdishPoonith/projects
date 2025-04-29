.class final Lc4/h0;
.super Lc4/i0;
.source "SourceFile"


# instance fields
.field final synthetic j:Landroid/content/Intent;

.field final synthetic k:Lcom/google/android/gms/common/api/internal/i;


# direct methods
.method constructor <init>(Landroid/content/Intent;Lcom/google/android/gms/common/api/internal/i;I)V
    .locals 0

    iput-object p1, p0, Lc4/h0;->j:Landroid/content/Intent;

    iput-object p2, p0, Lc4/h0;->k:Lcom/google/android/gms/common/api/internal/i;

    invoke-direct {p0}, Lc4/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lc4/h0;->j:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc4/h0;->k:Lcom/google/android/gms/common/api/internal/i;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/common/api/internal/i;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
