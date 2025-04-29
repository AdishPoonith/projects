.class public final synthetic Lp1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp1/c;

.field public final synthetic k:Lp1/u$e;

.field public final synthetic l:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lp1/c;Lp1/u$e;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/b;->j:Lp1/c;

    iput-object p2, p0, Lp1/b;->k:Lp1/u$e;

    iput-object p3, p0, Lp1/b;->l:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lp1/b;->j:Lp1/c;

    iget-object v1, p0, Lp1/b;->k:Lp1/u$e;

    iget-object v2, p0, Lp1/b;->l:Landroid/os/Bundle;

    invoke-static {v0, v1, v2}, Lp1/c;->I(Lp1/c;Lp1/u$e;Landroid/os/Bundle;)V

    return-void
.end method
