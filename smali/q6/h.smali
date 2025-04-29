.class public final synthetic Lq6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lq6/g$b;


# direct methods
.method public synthetic constructor <init>(Lq6/g$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq6/h;->j:Lq6/g$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq6/h;->j:Lq6/g$b;

    invoke-static {v0}, Lq6/g$b;->a(Lq6/g$b;)V

    return-void
.end method
