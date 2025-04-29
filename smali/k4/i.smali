.class final Lk4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk4/k;


# instance fields
.field final synthetic a:Lk4/a;


# direct methods
.method constructor <init>(Lk4/a;)V
    .locals 0

    iput-object p1, p0, Lk4/i;->a:Lk4/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk4/c;)V
    .locals 0

    iget-object p1, p0, Lk4/i;->a:Lk4/a;

    invoke-static {p1}, Lk4/a;->j(Lk4/a;)Lk4/c;

    move-result-object p1

    invoke-interface {p1}, Lk4/c;->d()V

    return-void
.end method

.method public final b()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method
