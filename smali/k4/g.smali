.class final Lk4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk4/k;


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Lk4/a;


# direct methods
.method constructor <init>(Lk4/a;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lk4/g;->b:Lk4/a;

    iput-object p2, p0, Lk4/g;->a:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk4/c;)V
    .locals 1

    iget-object p1, p0, Lk4/g;->b:Lk4/a;

    invoke-static {p1}, Lk4/a;->j(Lk4/a;)Lk4/c;

    move-result-object p1

    iget-object v0, p0, Lk4/g;->a:Landroid/os/Bundle;

    invoke-interface {p1, v0}, Lk4/c;->I(Landroid/os/Bundle;)V

    return-void
.end method

.method public final b()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
