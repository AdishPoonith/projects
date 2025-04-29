.class public final synthetic Lw8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lr8/d$b;


# direct methods
.method public synthetic constructor <init>(Lr8/d$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/i;->j:Lr8/d$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lw8/i;->j:Lr8/d$b;

    invoke-static {v0}, Lw8/j;->a(Lr8/d$b;)V

    return-void
.end method
