.class public final synthetic Ly0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:J

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ly0/b;->j:J

    iput-object p3, p0, Ly0/b;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-wide v0, p0, Ly0/b;->j:J

    iget-object v2, p0, Ly0/b;->k:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ly0/f;->a(JLjava/lang/String;)V

    return-void
.end method
