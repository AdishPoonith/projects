.class public final synthetic Lt1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/j;->a:Lt1/c$a;

    iput p2, p0, Lt1/j;->b:I

    iput-wide p3, p0, Lt1/j;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lt1/j;->a:Lt1/c$a;

    iget v1, p0, Lt1/j;->b:I

    iget-wide v2, p0, Lt1/j;->c:J

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, v2, v3, p1}, Lt1/o1;->Z0(Lt1/c$a;IJLt1/c;)V

    return-void
.end method
