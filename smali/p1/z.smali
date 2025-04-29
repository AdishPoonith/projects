.class public final synthetic Lp1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp1/a0;

.field public final synthetic k:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lp1/a0;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/z;->j:Lp1/a0;

    iput-object p2, p0, Lp1/z;->k:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp1/z;->j:Lp1/a0;

    iget-object v1, p0, Lp1/z;->k:Landroid/os/Bundle;

    invoke-static {v0, v1}, Lp1/a0;->a(Lp1/a0;Landroid/os/Bundle;)V

    return-void
.end method
