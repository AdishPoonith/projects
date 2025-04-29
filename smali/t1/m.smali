.class public final synthetic Lt1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:I

.field public final synthetic c:Ls1/c3$e;

.field public final synthetic d:Ls1/c3$e;


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;ILs1/c3$e;Ls1/c3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/m;->a:Lt1/c$a;

    iput p2, p0, Lt1/m;->b:I

    iput-object p3, p0, Lt1/m;->c:Ls1/c3$e;

    iput-object p4, p0, Lt1/m;->d:Ls1/c3$e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lt1/m;->a:Lt1/c$a;

    iget v1, p0, Lt1/m;->b:I

    iget-object v2, p0, Lt1/m;->c:Ls1/c3$e;

    iget-object v3, p0, Lt1/m;->d:Ls1/c3$e;

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, v2, v3, p1}, Lt1/o1;->U0(Lt1/c$a;ILs1/c3$e;Ls1/c3$e;Lt1/c;)V

    return-void
.end method
