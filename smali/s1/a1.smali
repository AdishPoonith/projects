.class public final synthetic Ls1/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/a1;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ls1/a1;->a:Ljava/util/List;

    check-cast p1, Ls1/c3$d;

    invoke-static {v0, p1}, Ls1/x0$c;->L(Ljava/util/List;Ls1/c3$d;)V

    return-void
.end method
