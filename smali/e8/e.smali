.class public final synthetic Le8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Le8/c$h;


# direct methods
.method public synthetic constructor <init>(Le8/c$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/e;->j:Le8/c$h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le8/e;->j:Le8/c$h;

    invoke-static {v0}, Le8/c$h;->c(Le8/c$h;)V

    return-void
.end method
