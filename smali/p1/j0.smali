.class public final synthetic Lp1/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp1/k0;

.field public final synthetic k:Lp1/u$e;

.field public final synthetic l:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lp1/k0;Lp1/u$e;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/j0;->j:Lp1/k0;

    iput-object p2, p0, Lp1/j0;->k:Lp1/u$e;

    iput-object p3, p0, Lp1/j0;->l:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lp1/j0;->j:Lp1/k0;

    iget-object v1, p0, Lp1/j0;->k:Lp1/u$e;

    iget-object v2, p0, Lp1/j0;->l:Landroid/os/Bundle;

    invoke-static {v0, v1, v2}, Lp1/k0;->B(Lp1/k0;Lp1/u$e;Landroid/os/Bundle;)V

    return-void
.end method
