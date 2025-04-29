.class public final synthetic Lt1/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:Ls1/v1;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;Ls1/v1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/i0;->a:Lt1/c$a;

    iput-object p2, p0, Lt1/i0;->b:Ls1/v1;

    iput p3, p0, Lt1/i0;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt1/i0;->a:Lt1/c$a;

    iget-object v1, p0, Lt1/i0;->b:Ls1/v1;

    iget v2, p0, Lt1/i0;->c:I

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, v2, p1}, Lt1/o1;->G0(Lt1/c$a;Ls1/v1;ILt1/c;)V

    return-void
.end method
