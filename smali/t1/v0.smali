.class public final synthetic Lt1/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/v0;->a:Lt1/c$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lt1/v0;->a:Lt1/c$a;

    check-cast p1, Lt1/c;

    invoke-static {v0, p1}, Lt1/o1;->R0(Lt1/c$a;Lt1/c;)V

    return-void
.end method
