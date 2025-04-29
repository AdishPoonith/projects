.class public final synthetic Lt1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/n;->a:Lt1/c$a;

    iput p2, p0, Lt1/n;->b:I

    iput-boolean p3, p0, Lt1/n;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt1/n;->a:Lt1/c$a;

    iget v1, p0, Lt1/n;->b:I

    iget-boolean v2, p0, Lt1/n;->c:Z

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, v2, p1}, Lt1/o1;->r0(Lt1/c$a;IZLt1/c;)V

    return-void
.end method
