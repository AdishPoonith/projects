.class Lj0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj0/a;->a(Landroid/app/Activity;Lr8/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr8/k$d;

.field final synthetic b:Lj0/a;


# direct methods
.method constructor <init>(Lj0/a;Lr8/k$d;)V
    .locals 0

    iput-object p1, p0, Lj0/a$a;->b:Lj0/a;

    iput-object p2, p0, Lj0/a$a;->a:Lr8/k$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lj0/a$a;->a:Lr8/k$d;

    const-string v1, "CANCELLED"

    const-string v2, "User has cancelled login with facebook"

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lj0/a$a;->a:Lr8/k$d;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "FAILED"

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lp0/a;)V
    .locals 1

    invoke-static {p1}, Lj0/a;->b(Lp0/a;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Lj0/a$a;->a:Lr8/k$d;

    invoke-interface {v0, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method
