.class public final synthetic Lj2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/v$g;


# instance fields
.field public final synthetic a:Ls1/n1;


# direct methods
.method public synthetic constructor <init>(Ls1/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj2/r;->a:Ls1/n1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lj2/r;->a:Ls1/n1;

    check-cast p1, Lj2/n;

    invoke-static {v0, p1}, Lj2/v;->c(Ls1/n1;Lj2/n;)I

    move-result p1

    return p1
.end method
