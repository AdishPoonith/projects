.class public final synthetic Lq0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lq0/z;


# direct methods
.method public synthetic constructor <init>(Lq0/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/i;->j:Lq0/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq0/i;->j:Lq0/z;

    invoke-static {v0}, Lq0/m;->e(Lq0/z;)V

    return-void
.end method
